package edu.project.sample.spring.ioc.annotations;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationClass {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public AnnotatedClassA annotatedClassA01configurationClass(){
        return new AnnotatedClassA(false,1,"classA-from-configurationClass");
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public AnnotatedClassB annotatedClassB01configurationClass(){
        return new AnnotatedClassB("classB-01-from-configurationClass");
    }

//    @Component - Аннотация для любого компонента фреймворка.
//
//    @Service - (Сервис-слой приложения) Аннотация обьявляющая, что этот класс представляет собой сервис – компонент сервис-слоя.
//
//    Сервис является подтипом класса @Component. Использование данной аннотации позволит искать бины-сервисы автоматически.
//
//    @Repository - (Доменный слой) Аннотация показывает, что класс функционирует как репозиторий и требует наличия прозрачной трансляции исключений. Преимуществом трансляции исключений является то, что слой сервиса будет иметь дело с общей иерархией исключений от Spring (DataAccessException) вне зависимости от используемых технологий доступа к данным в слое данных.
//
//    @Controller - (Слой представления) Аннотация для маркировки java класса, как класса контроллера. Данный класс представляет собой компонент, похожий на обычный сервлет (HttpServlet) (работающий с объектами HttpServletRequest и HttpServletResponse), но с расширенными возможностями от Spring Framework.
//
//    @ResponseBody - Аннотация показывает что данный метод может возвращать кастомный объект в виде xml, json...
//
//    @RestController - Аннотация аккумулирует поведение двух аннотаций @Controller и @ResponseBody
//
//    @Transactional - Перед исполнением метода помеченного данной аннотацией начинается транзакция, после выполнения метода транзакция коммитится, при выбрасывании RuntimeException откатывается.
//
//    @Autowired - Аннотация позволяет автоматически установить значение поля.
//
//    @RequestMapping - Аннотация используется для маппинга урл-адреса запроса на указанный метод или класс. Можно указывать конкретный HTTP-метод, который будет обрабатываться (GET/POST), передавать параметры запроса.
//
//    @ModelAttribute - Аннотация, связывающая параметр метода или возвращаемое значение метода с атрибутом модели, которая будет использоваться при выводе jsp-страницы.
//
//    @PathVariable - Аннотация, которая показывает, что параметр метода должен быть связан с переменной из урл-адреса.
//
//    @Scope - Аннотация для установки области жизни бина: singleton (только один экземпляр бина создается для IoC контейнера; значение по умолчанию ), prototype (создается новый экземпляр бина когда приходит запрос на его создание), request (один экземпляр бина для каждого HTTP запроса ), session (один экземпляр бина для каждой сессии), globalSession (один экземпляр бина для каждой глобальной сессии)
//
//    @PostConstruct - Аннотация для метода, который будет вызван после вызова конструктора бина.
//
//    @PreDestroy - Аннотация для метода, который будет вызван перед уничтожением бина.
//
//    @Profile - Аннотация для создания профилей конфигурации проекта. Может применяться как к бинам так и к конфигурационным классам.


}
