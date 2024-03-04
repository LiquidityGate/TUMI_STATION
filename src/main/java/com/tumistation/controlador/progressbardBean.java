
package com.tumistation.controlador;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named ("progressbard")
@RequestScoped
public class progressbardBean {
    private String currentStep;
    private List<String> steps;

    public progressbardBean() {
        steps = new ArrayList<>();
        steps.add("one");
        steps.add("two");
        steps.add("three");
        steps.add("complete");
    }

    public void nextStep(boolean next) {
        int currentIndex = steps.indexOf(currentStep);

        if (!next) {
            if (currentStep.equals("complete")) {
                currentStep = steps.get(steps.size() - 1);
            } else if (currentIndex > 0) {
                currentStep = steps.get(currentIndex - 1);
            } else {
                currentStep = "start";
            }
        } else {
            if (currentStep.equals("complete")) {
                currentStep = "start";
            } else if (currentIndex < steps.size() - 1) {
                currentStep = steps.get(currentIndex + 1);
            } else {
                currentStep = "complete";
            }
        }
    }

    public String stepClasses(int index) {
        StringBuilder result = new StringBuilder("progress__step progress__step--" + (index + 1) + " ");
        if (currentStep.equals("complete") || index < steps.indexOf(currentStep)) {
            result.append("progress__step--complete");
        } else if (index == steps.indexOf(currentStep)) {
            result.append("progress__step--active");
        }
        return result.toString();
    }

    public String getProgressClasses() {
        StringBuilder result = new StringBuilder("progress ");
        if (currentStep.equals("complete")) {
            result.append("progress--complete");
        } else {
            result.append("progress--").append(steps.indexOf(currentStep) + 1);
        }
        return result.toString();
    }

    // Getters and setters
    public String getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(String currentStep) {
        this.currentStep = currentStep;
    }

    public List<String> getSteps() {
        return steps;
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }
}
