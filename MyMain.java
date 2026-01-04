/**
 * Our main class for understanding inheritance and polymorphism in a software setting<br>.
 */

public class MyMain {

	//--------------------------------------------------
	//	testLanguage
	//--------------------------------------------------
	/**
	 * This function tests the Language class.<br>
	 */
	public static void testLanguage(){
        System.out.println("\nTesting Language\n");

		Language l1 = new Language (false, 0);

		boolean b = l1.getAlphabetBased();
		System.out.println(b);
		int i = l1.getNumLanguageSpeakers();
		System.out.println(i);

        i = l1.computeSalary();
        System.out.println(i);

        i = l1.computeSalary(30);
        System.out.println(i);

		l1.setAlphabetBased(true);
		l1.setNumLanguageSpeakers(12);

		b = l1.getAlphabetBased();
		System.out.println(b);
		i = l1.getNumLanguageSpeakers();
		System.out.println(i);

		i = l1.computeSalary();
		System.out.println(i);

        i = l1.computeSalary(30);
        System.out.println(i);
	}


    //--------------------------------------------------
    //	testProgrammingLanguage
    //--------------------------------------------------
    /**
     * This function tests the ProgrammingLanguage class.<br>
     */
    public static void testProgrammingLanguage(){
        System.out.println("\nTesting ProgrammingLanguage\n");

		ProgrammingLanguage l1 = new ProgrammingLanguage(20, 12);

		boolean b = l1.getAlphabetBased();
		System.out.println(b);
		int i = l1.getNumLanguageSpeakers();
		System.out.println(i);
		i = l1.getLearningMonths();
		System.out.println(i);

        i = l1.computeSalary();
        System.out.println(i);

        i = l1.decideProgrammingLanguageOrLanguageSalary(1);
        System.out.println(i);

        i = l1.decideProgrammingLanguageOrLanguageSalary(2);
        System.out.println(i);

        l1.setAlphabetBased(false);
        l1.setNumLanguageSpeakers(30);
        l1.setLearningMonths(24);

        b = l1.getAlphabetBased();
        System.out.println(b);
        i = l1.getNumLanguageSpeakers();
        System.out.println(i);
        i = l1.getLearningMonths();
        System.out.println(i);

        i = l1.computeSalary();
        System.out.println(i);

        i = l1.decideProgrammingLanguageOrLanguageSalary(1);
        System.out.println(i);

        i = l1.decideProgrammingLanguageOrLanguageSalary(2);
        System.out.println(i);
	}


    //--------------------------------------------------
    //	testOOPLanguage
    //--------------------------------------------------
    /**
     * This function tests the OOPLanguage class.<br>
     */
    public static void testOOPLanguage(){
        System.out.println("\nTesting OOPLanguage\n");

		OOPLanguage l1 = new OOPLanguage(20, 12, true);

		boolean b = l1.getAlphabetBased();
		System.out.println(b);
		int i = l1.getNumLanguageSpeakers();
		System.out.println(i);
		i = l1.getLearningMonths();
		System.out.println(i);
		b = l1.getIsCompiled();
		System.out.println(b);

        i = l1.computeSalary();
        System.out.println(i);

        i = l1.decideOOPLanguageOrProgrammingLanguageOrLanguageSalary(1);
        System.out.println(i);

        i = l1.decideOOPLanguageOrProgrammingLanguageOrLanguageSalary(2);
        System.out.println(i);

        i = l1.decideOOPLanguageOrProgrammingLanguageOrLanguageSalary(3);
        System.out.println(i);

        i = l1.computeSalary();
        System.out.println(i);

        i = l1.decideOOPLanguageOrProgrammingLanguageOrLanguageSalary(1);
        System.out.println(i);

        i = l1.decideOOPLanguageOrProgrammingLanguageOrLanguageSalary(2);
        System.out.println(i);

        i = l1.decideOOPLanguageOrProgrammingLanguageOrLanguageSalary(3);
        System.out.println(i);

        l1.setIsCompiled(false);

        b = l1.getIsCompiled();
        System.out.println(b);

        i = l1.computeSalary();
        System.out.println(i);

        i = l1.decideOOPLanguageOrProgrammingLanguageOrLanguageSalary(1);
        System.out.println(i);

        i = l1.decideOOPLanguageOrProgrammingLanguageOrLanguageSalary(2);
        System.out.println(i);

        i = l1.decideOOPLanguageOrProgrammingLanguageOrLanguageSalary(3);
        System.out.println(i);
	}


	//--------------------------------------------------
	//	MAIN
	//--------------------------------------------------
	/**
	 * Main Method:<br>
	 * 1) It calls to drinkFunctionality.<br>
	 * The function shows the main class and object-related concepts we must know for the module.<br>
	 * 2) It calls to refVarsFunctionality.<br>
	 * The function shows the main primitive vs. reference variables concepts we must know for the module.<br>
	 * @param args: We will run the program parameter free, so do not worry about it.
	 */
	public static void main(String[] args) {
		// 1. We parse any parameter in
		int option = 3;

		// 2. We call to the method we want to try
		switch (option) {
			case 1:
				testLanguage();
				break;
			case 2:
				testProgrammingLanguage();
				break;
			case 3:
				testOOPLanguage();
				break;
		}
	}

}