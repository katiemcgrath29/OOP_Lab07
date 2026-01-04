
public class Language {
    private boolean alphabetBased;
    private int numLanguageSpeakers;

    public Language(boolean alphabetBased, int numLanguageSpeakers) {
        this.alphabetBased = alphabetBased;
        this.numLanguageSpeakers = numLanguageSpeakers;
    }
    
    public int computeSalary(){
        if (!alphabetBased){
            return 40000;
        } else {
            return 10000 - (1000 * numLanguageSpeakers);
        }
    }

    public int computeSalary(int numYearsExperience){
        return 5000 * numYearsExperience;
    }
    
    public boolean getAlphabetBased(){
        return alphabetBased;
    }

    public void setAlphabetBased(boolean alphabetBased){
        this.alphabetBased = alphabetBased;
    }

    public int getNumLanguageSpeakers(){
        return numLanguageSpeakers;
    }

    public void setNumLanguageSpeakers(int numLanguageSpeakers){
        this.numLanguageSpeakers = numLanguageSpeakers;
    }
}
