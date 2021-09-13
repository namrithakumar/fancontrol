package org.example.fancontrol.states.values;

public enum DirectionType {
    CLOCKWISE("CLOCKWISE"),
    COUNTERCLOCKWISE("COUNTER CLOCKWISE");

    public final String label;

    private DirectionType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public static DirectionType valueOfLabel(String label) {
        for(DirectionType e : values()) {
            if (e.label.equals(label)) {
                return e;
            }
        }
        return null;
    }
}
