package ec.edu.ups.validation;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator ("vusuario")

public class ValidarUsuario implements Validator {

	@Override
	public void validate(FacesContext fc, UIComponent uio, Object o) throws ValidatorException {
		
		String usuario = o.toString().trim();
		
		if(usuario.length()==0){
			
			throw new ValidatorException(new FacesMessage("Ingrese el Usuario"));
			
			
		}else {
			String erUsuario = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]*";
			boolean ok = Pattern.matches(erUsuario, usuario);
			
			if (!ok) {
				throw new ValidatorException(new FacesMessage("ingrese numero, letras y caracteres especiales "));
				
			}
			
			
		}

		
		
	}
	
	
	
	
	

}
