package com.epam.training.student_tatsiana_mikhnavets.clean_code.Java.src.main.java.Planes;


import com.epam.training.student_tatsiana_mikhnavets.clean_code.Java.src.main.java.models.ClassificationLevels;
import com.epam.training.student_tatsiana_mikhnavets.clean_code.Java.src.main.java.models.ExperimentalTypes;

public class ExperimentalPlane extends Plane{

    private ExperimentalTypes experimentalType;
    private static ClassificationLevels classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes experimentalType, ClassificationLevels classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalType = experimentalType;
        this.classificationLevel = classificationLevel;
    }

    public static ClassificationLevels getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevels classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }
}
