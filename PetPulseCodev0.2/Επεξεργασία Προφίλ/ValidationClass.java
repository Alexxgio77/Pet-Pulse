public class ValidationClass {
    public boolean validateData(String data) { return data != null && !data.trim().isEmpty(); }
    public boolean validateVetData(String vetData) { return vetData != null && vetData.length() > 10; }
    public boolean validateProgram(String programData) { return programData != null && !programData.trim().isEmpty(); }
}