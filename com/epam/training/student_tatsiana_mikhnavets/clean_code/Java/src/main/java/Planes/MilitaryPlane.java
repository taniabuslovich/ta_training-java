package com.epam.training.student_tatsiana_mikhnavets.clean_code.Java.src.main.java.Planes;


import com.epam.training.student_tatsiana_mikhnavets.clean_code.Java.src.main.java.models.MilitaryPlaneTypes;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private MilitaryPlaneTypes militaryPlaneType;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryPlaneTypes planePurpose) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryPlaneType = planePurpose;
    }

    public MilitaryPlaneTypes getPlanePurpose() {
        return militaryPlaneType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", militaryPlaneType=" + militaryPlaneType +
                '}');
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof MilitaryPlane)) return false;
        if (!super.equals(object)) return false;
        MilitaryPlane that = (MilitaryPlane) object;
        return militaryPlaneType == that.militaryPlaneType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryPlaneType);
    }
}
