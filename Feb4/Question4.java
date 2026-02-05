package Feb4;

interface MealPlan {
    String getCategory();
    void customize(String userPref);
}

class VegetarianMeal implements MealPlan {
    private String planDetails = "Base vegetarian plan";

    @Override
    public String getCategory() {
        return "Vegetarian";
    }

    @Override
    public void customize(String userPref) {
        planDetails += " | Pref: " + userPref;
    }

    @Override
    public String toString() {
        return planDetails;
    }
}

class VeganMeal implements MealPlan {
    private String planDetails = "Base vegan plan";

    @Override
    public String getCategory() {
        return "Vegan";
    }

    @Override
    public void customize(String userPref) {
        planDetails += " | Pref: " + userPref;
    }

    @Override
    public String toString() {
        return planDetails;
    }
}

class Meal<T extends MealPlan> {
    private T plan;

    public Meal(T plan) {
        this.plan = plan;
    }

    public T getPlan() {
        return plan;
    }
}

public class Question4 {

    public static <T extends MealPlan> T generatePlan(T template, String userPref) {
        template.customize(userPref);
        return template;
    }

    public static void main(String[] args) {
        VegetarianMeal vegTemplate = new VegetarianMeal();
        VeganMeal veganTemplate = new VeganMeal();

        VegetarianMeal vegPlan = generatePlan(vegTemplate, "no onion, high protein");
        VeganMeal veganPlan = generatePlan(veganTemplate, "gluten free");

        System.out.println(vegPlan.getCategory() + " -> " + vegPlan);
        System.out.println(veganPlan.getCategory() + " -> " + veganPlan);
    }
}