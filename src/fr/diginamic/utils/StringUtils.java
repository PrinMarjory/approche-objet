package fr.diginamic.utils;

import java.lang.reflect.Field;

import fr.diginamic.annotations.ToString;
import fr.diginamic.exceptions.ToStringException;

/**
 * Fournit des méthodes réutilisables sur les String 
 * @author Marjory PRIN
 */
public class StringUtils {
	
	/**
	 * Génère une String sur la base d'annotations sur les attributs
	 * @param classe : classe de l'entité
	 * @return String
	 */
	public static String generateToString (Object instance) {
		
		// Initialisation des variables
		Class<?> classe = instance.getClass();
		Field[] attributs = classe.getDeclaredFields();
		ToString annot = null;
		String separateur = "";
		boolean isUpperCase = false;
		
		String result = "";
		
		for (Field f : attributs) {
			f.setAccessible(true);
			if (f.isAnnotationPresent(ToString.class)) {
				
				annot = f.getAnnotation(ToString.class);
				separateur = annot.separateur();
				isUpperCase = annot.upperCase();
				
				try {
					if (isUpperCase) {
						result += f.get(instance).toString().toUpperCase() + separateur;
					} else {
						result += f.get(instance) + separateur;
					}
				}
				catch (IllegalArgumentException | IllegalAccessException e) {
					throw new ToStringException(e.getMessage());
				}
			}
		}
		return result;
	}
}
