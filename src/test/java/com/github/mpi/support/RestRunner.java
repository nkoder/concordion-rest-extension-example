package com.github.mpi.support;

import org.concordion.api.Fixture;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runners.model.InitializationError;
import org.springframework.test.context.TestContextManager;

public class RestRunner extends ConcordionRunner {

    public RestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    @Override
    protected Fixture createFixture(Object fixtureObject) {
        TestContextManager testContextManager = new TestContextManager(getTestClass().getJavaClass());
        try {
            testContextManager.prepareTestInstance(fixtureObject);
        } catch (Exception exception) {
            // TODO Are we sure that every exception is about Spring context?
            throw new RuntimeException("Could not create spring context!", exception);
        }
        return super.createFixture(fixtureObject);
    }

}
