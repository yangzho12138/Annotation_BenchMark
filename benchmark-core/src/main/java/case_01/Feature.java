package case_01;

public class Feature {
    private String name;
    private String script;
    private String returnType;
    private String scriptType;

    public Feature(String name, String script, String returnType, String scriptType) {
        this.name = name;
        this.script = script;
        this.returnType = returnType;
        this.scriptType = scriptType;
    }

    public String getName() {
        return name;
    }

    public String getScript() {
        return script;
    }

    public String getReturnType() {
        return returnType;
    }

    public String getScriptType() {
        return scriptType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public void setScriptType(String scriptType) {
        this.scriptType = scriptType;
    }
}
