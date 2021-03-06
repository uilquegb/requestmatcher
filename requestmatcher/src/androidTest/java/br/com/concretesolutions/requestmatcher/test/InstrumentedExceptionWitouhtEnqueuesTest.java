package br.com.concretesolutions.requestmatcher.test;

import android.support.test.runner.AndroidJUnit4;

import org.junit.runner.RunWith;

import br.com.concretesolutions.requestmatcher.InstrumentedTestRequestMatcherRule;
import br.com.concretesolutions.requestmatcher.LocalTestRequestMatcherRule;
import br.com.concretesolutions.requestmatcher.RequestMatcherRule;

@RunWith(AndroidJUnit4.class)
public class InstrumentedExceptionWitouhtEnqueuesTest extends ExceptionWitouhtEnqueuesTest {

    @Override
    protected RequestMatcherRule getRequestMatcherRule() {
        return new InstrumentedTestRequestMatcherRule();
    }
}
