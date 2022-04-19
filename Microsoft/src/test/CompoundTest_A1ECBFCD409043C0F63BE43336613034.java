/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class CompoundTest_A1ECBFCD409043C0F63BE43336613034
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1ECBFCD409043C0F63BE43336613034(IContainer parent, String name) {
		super(parent, "Azure-Marketplace-Tests", "A1ECBFCD409043C0F63BE43336613034");
	}

	public void execute() {

		this.add(new test.HCL_Azure_Marketplace_Test_A1ECA12C4F7C9380EA7AB83164626234(this,
				"A1ECBFCD43119770F63BE43336613034") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}