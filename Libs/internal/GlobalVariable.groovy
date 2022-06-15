package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object locale
     
    /**
     * <p></p>
     */
    public static Object randomMail
     
    /**
     * <p></p>
     */
    public static Object randomSurname
     
    /**
     * <p></p>
     */
    public static Object randomFirst
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            locale = selectedVariables['locale']
            randomMail = selectedVariables['randomMail']
            randomSurname = selectedVariables['randomSurname']
            randomFirst = selectedVariables['randomFirst']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
