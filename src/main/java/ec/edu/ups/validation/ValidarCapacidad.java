package ec.edu.ups.validation;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator ("vcapacidad")

public class ValidarCapacidad implements Validator {

	
	@Override
	public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
		
		String capasidad= o.toString().trim();
		
		if(capasidad.length()==0) {
			
			throw new ValidatorException(new FacesMessage("Ingrese la Capacidad"));
		}else {
			
			String ercapasidad="^\\d{1,2}$";
			boolean estaBien=Pattern.matches(ercapasidad, capasidad);
			
			if(!estaBien){
				
				throw new ValidatorException(new FacesMessage("Maximo 2 # "));

				
			}
		}
		
		
		
	}
	
	
	

}
