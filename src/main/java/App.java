import aspects.NotVeryUsefullAspect;
import beans.Party;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

/**
 * Created by tomasz on 30.10.14.
 */
@Configuration
@EnableAspectJAutoProxy
public class App {

    @Bean
    public NotVeryUsefullAspect createAspect() {
        return new NotVeryUsefullAspect();
    }

    @Scope("prototype")
    @Bean(name = "party")
    public Object createParty() {
        return new Party();
    }


}
