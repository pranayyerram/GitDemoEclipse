package _7_RetryFailedTests;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class _2_RetryListenerClass implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation annotation,Class TestClass, Constructor testConstructor, Method TestMethod) {
		
		annotation.setRetryAnalyzer(_2_IRetryAnalyzer.class);
	}
	
	
}
