package th.co.bell.demo.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ServiceLocator {

    private static ServiceLocator instance = new ServiceLocator();
    private ApplicationContext context;

    public static ServiceLocator getInstance() {
        return instance;
    }

    public <T> T getBean(Class<T> clazz) {
        return context.getBean(clazz);
    }

    public <T> T getBean(Class<T> clazz, String qualifier) {
        return context.getBean(clazz, qualifier);
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        context = applicationContext;
    }

}