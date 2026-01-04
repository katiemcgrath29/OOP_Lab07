
public class OOPLanguage extends ProgrammingLanguage {
    private boolean isCompiled;

    public OOPLanguage(boolean alphabetBased, int numLanguageSpeakers, int learningMonths, boolean isCompiled) {
        super(alphabetBased, numLanguageSpeakers, learningMonths);
        this.isCompiled = isCompiled;
    }

    public int computeSalary() {
        if (isCompiled) {
            return super.computeSalary();
        } else {
            return 50000;
        }
    }

    public int decideOOPLanguageOrProgrammingLanguageOrLanguageSalary(int option){
        switch (option) {
            case 1:
                return this.computeSalary();
            case 2:
                return super.computeSalary();
            case 3:
                return ((Language) this).computeSalary();
            default:
                return this.computeSalary();
        }

    }

    public boolean getIsCompiled(){
        return isCompiled;
    }

    public void setIsCompiled(boolean isCompiled){
        this.isCompiled = isCompiled;
    }





}
