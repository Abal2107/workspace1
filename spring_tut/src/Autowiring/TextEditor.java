package Autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	@Autowired
	SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	public void checkSpell()
	{
		spellChecker.checkSpelling();
	}
	
}
