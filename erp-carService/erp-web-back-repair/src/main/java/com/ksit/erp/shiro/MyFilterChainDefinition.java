package com.ksit.erp.shiro;

import com.ksit.erp.entity.Permission;
import com.ksit.erp.service.IPermissionService;
import org.apache.shiro.config.Ini;
import org.apache.shiro.web.filter.mgt.DefaultFilterChainManager;
import org.apache.shiro.web.filter.mgt.PathMatchingFilterChainResolver;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * Created by houfalv on 2018/8/6.
 */
public class MyFilterChainDefinition {

    @Autowired
    private IPermissionService iPermissionService;

    //这个就是在配置文件中的   【路径对应的权限】
    private String definitions;

    //在配置文件中引入 ShiroFilterFactoryBean 这个类型
    private AbstractShiroFilter abstractShiroFilter;

    /**
     * 初始化权限
     */
    @PostConstruct
    public synchronized void init(){
        System.err.println("^_^---^_^---^_^---权限初始化中--^_^---^_^---^_^");
        getFilterChainManager().getFilterChains().clear();
        load();
    }

    /**
     * 更新权限
     */
    public synchronized void updatePermission(){
        System.err.println("^_^---^_^---^_^---权限更新 中--^_^---^_^---^_^");
        getFilterChainManager().getFilterChains().clear();
        load();
    }

    /**
     * 加载权限
     */
    public synchronized void load(){
        Ini ini = new Ini();
        //加载在配置文件中配置好的映射
        ini.load(definitions);
        Ini.Section section = ini.getSection(Ini.DEFAULT_SECTION_NAME);

        //从数据库中获取所有Permission 信息
        List<Permission> permissionList = iPermissionService.listPermission();

        for (Permission permission : permissionList) {
            section.put(permission.getUrl(),"perms["+permission.getPermissionCode()+"]");
            System.err.println(permission.getUrl() + "------>        perms["+permission.getPermissionCode()+"]");
        }

        //暂时不配置 /** 权限，存在加载顺序问题

        DefaultFilterChainManager filterChainManager = getFilterChainManager();
        for (Map.Entry<String, String> entry : section.entrySet()) {
            filterChainManager.createChain(entry.getKey(),entry.getValue());
        }
    }

    public DefaultFilterChainManager getFilterChainManager(){
        PathMatchingFilterChainResolver pathMatchingFilterChainResolver = (PathMatchingFilterChainResolver) this.abstractShiroFilter.getFilterChainResolver();
        DefaultFilterChainManager defaultFilterChainManager = (DefaultFilterChainManager) pathMatchingFilterChainResolver.getFilterChainManager();
        return defaultFilterChainManager;
    }

    public void setDefinitions(String definitions) {
        this.definitions = definitions;
    }

    public void setAbstractShiroFilter(AbstractShiroFilter abstractShiroFilter) {
        this.abstractShiroFilter = abstractShiroFilter;
    }
}
