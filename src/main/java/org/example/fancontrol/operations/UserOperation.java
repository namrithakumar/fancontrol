package org.example.fancontrol.operations;

public enum UserOperation {
    CHANGE_SPEED("SPEED"),
    CHANGE_DIRECTION("DIRECTION");

    public final String label;

    private UserOperation(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public static UserOperation valueOfLabel(String label) {
        for(UserOperation e : values()) {
            if (e.label.equalsIgnoreCase(label)) {
                return e;
            }
        }
        return null;
    }
}