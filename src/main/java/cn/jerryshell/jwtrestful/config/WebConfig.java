package cn.jerryshell.jwtrestful.config;

import cn.jerryshell.jwtrestful.interceptor.RoleInterceptor;
import cn.jerryshell.jwtrestful.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // Token 拦截器
        registry.addInterceptor(new TokenInterceptor()).addPathPatterns("/**");
        // 角色权限拦截器
        registry.addInterceptor(new RoleInterceptor()).addPathPatterns("/**");
    }
}
