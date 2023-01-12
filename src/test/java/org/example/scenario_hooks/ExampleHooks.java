package org.example.scenario_hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.steps.CustomDebugSteps;
import ru.ibsqa.qualit.utils.spring.SpringUtils;

// Примеры выполнения действий до и после каждого сценария
public class ExampleHooks {

    // Этот класс не является бином, поэтому вместо @Autowired используется SpringUtils.getBean(..)
    private CustomDebugSteps customDebugSteps = SpringUtils.getBean(CustomDebugSteps.class);

    @Before // Здесь также можно указать порядок выполнения хука и теги, к которым применяется данный хук
    //@HiddenStep Используйте эту аннотацию, чтобы скрыть действия в отчете
    public void before() {
        customDebugSteps.stepDebug("Подготовительные действия");
    }

    @After
    public void after() {
        customDebugSteps.stepDebug("Завершающие действия");
    }
}
