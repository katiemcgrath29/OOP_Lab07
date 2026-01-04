
public class ProgrammingLanguage extends Language {
    private int learningMonths;

    public ProgrammingLanguage(boolean alphabetBased, int numLanguageSpeakers, int learningMonths) {
        super(alphabetBased, numLanguageSpeakers);
        this.learningMonths = learningMonths;
    }

    public int computeSalary() {
        int baseSalary = super.computeSalary();
        return baseSalary + (200 * learningMonths);
    }

    public int decideProgrammingLanguageOrLanguageSalary(int option) {
        if (option == 1) {
            return this.computeSalary();
        } else {
            return super.computeSalary();
        }
    }

    public int getLearningMonths() {
        return learningMonths;
    }

    public void setLearningMonths(int learningMonths) {
        this.learningMonths = learningMonths;
    }

    public void setAlphabetBased(boolean alphabetBased) {
        super.setAlphabetBased(alphabetBased);
    }








}
