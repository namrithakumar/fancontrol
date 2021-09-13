package org.example.fancontrol.states.values;

public enum SpeedType {
    OFF("OFF"),
    LOW("LOW"),
    MEDIUM("MEDIUM"),
    HIGH("HIGH");

    public final String label;

    private SpeedType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public static SpeedType valueOfLabel(String label) {
        for(SpeedType e : values()) {
            if (e.label.equals(label)) {
                return e;
            }
        }
        return null;
    }
}