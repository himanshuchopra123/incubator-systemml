package com.ibm.bi.dml.slowtest.integration.functions.binary.matrix;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/** Group together the tests in this package into a single suite so that the Maven build
 *  won't run two of them at once. */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	DiagMatrixMultiplicationTest.class,
	FullIntegerDivisionTest.class,
	FullMatrixMatrixCellwiseOperationTest.class,
	FullMatrixMultiplicationTest.class,
	FullMatrixMultiplicationTransposeSelfTest.class,
	FullMatrixVectorColCellwiseOperationTest.class,
	FullMatrixVectorRowCellwiseOperationTest.class,
	FullMinMaxComparisonTest.class,
	FullPowerTest.class,
	FullPPredMatrixTest.class,
	FullPPredScalarRightTest.class,
	TransposeMatrixMultiplicationTest.class
})


/** This class is just a holder for the above JUnit annotations. */
public class ZPackageSuite {

}