/*
 * generated by Xtext
 */
package org.yakindu.base.expressions.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.yakindu.base.expressions.ui.internal.ExpressionsActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ExpressionsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ExpressionsActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ExpressionsActivator.getInstance().getInjector(ExpressionsActivator.ORG_YAKINDU_BASE_EXPRESSIONS_EXPRESSIONS);
	}
	
}
