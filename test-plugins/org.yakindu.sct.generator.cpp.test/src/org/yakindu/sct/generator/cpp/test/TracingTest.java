/**
 * Copyright (c) 2018 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 *
 */
package org.yakindu.sct.generator.cpp.test;

import java.util.Collection;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.yakindu.sct.generator.c.gtest.GTest;
import org.yakindu.sct.generator.c.gtest.GTestHelper;
import org.yakindu.sct.generator.c.gtest.GTestRunner;

@GTest(sourceFile = "gtests/TracingTest/TracingTest.cc", program = "gtests/TracingTest/Tracing", model = "testmodels/SCTUnit/Tracing.sct", statechartBundle = "org.yakindu.sct.test.models")
@RunWith(GTestRunner.class)
public class TracingTest {
	protected final GTestHelper helper = new GTestHelper(this) {
		
		@Override
		protected void getTestDataFiles(Collection<String> files) {
			super.getTestDataFiles(files);
			files.add("gtests/TracingTest/TraceObserverImpl.h");
		}
		
		@Override
		protected void getSourceFiles(Collection<String> files) {
			super.getSourceFiles(files);
			files.add(getFileName(getTestProgram()) + ".cpp");
		}
		
	};
	
	@Before
	public void setUp() {
		helper.generate();
		helper.compile();
	}
}
