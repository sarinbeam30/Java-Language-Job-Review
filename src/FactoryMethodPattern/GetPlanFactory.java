package FactoryMethodPattern;

public class GetPlanFactory {
    public Plan getPlan(String planType){
        if (planType == null) {
            return null;
        }

        // equalsIgnoreCase ---> compare two given string. If two strings are equal(can be both UPPERCASE and LOWERCASE).
        // Then, It will return TRUE.
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }

        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        }

        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }

        return null;

    }
}
