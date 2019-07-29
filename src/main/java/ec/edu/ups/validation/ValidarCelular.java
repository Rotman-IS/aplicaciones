package ec.edu.ups.validation;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator ("vcedula")

public class ValidarCelular implements Validator {

	
	
	@Override
	public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {

		String cedula = o.toString().trim();
		
		if(cedula.length()==0){
			throw new ValidatorException(new FacesMessage("Ingrese la Cedula"));	
			
		}else {
			
			String erTexto="\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d$";
			boolean ok=Pattern.matches(erTexto, cedula);
		
			if (!ok) {
				
			throw new ValidatorException(new FacesMessage("Ingrese 10 caracteres"));	
				
			}
			
			
		}
		
		
	}
	
	
	

}
