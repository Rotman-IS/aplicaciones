package ec.edu.ups.validation;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator ("vplaca")
public class ValidacionPlaca  implements Validator  {
	

	
		@Override
		public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
			
			String placa= o.toString().trim();
			
			if(placa.length()==0) {
				
				throw new ValidatorException(new FacesMessage("Ingrese la Placa"));
			}else {
				
				String erplaca="^[A-Za-z]{3}\\d{3,4}$";
				boolean estaBien=Pattern.matches(erplaca, placa);
				
				if(!estaBien){
					
					throw new ValidatorException(new FacesMessage("Formato ABC1234 O ABC123 "));

					
				
			}
			
			
			
		}
		
		
		

	}


}
