public class Zodiaco extends Fecha{

	

	public Zodiaco(int dia, int mes) {
		super(dia, mes);
	}
	

	public String calcularSignoZodiacal() {
        if (mes == 1) {
            if (dia >= 21) {
                //acuario
                return "acuario";
            } else {
                //capricornio
                return "capricornio";
            }
        }
        if (mes == 2) {
            if (dia >= 19) {
                return "piscis";
            } else {
                return "acuario";
            }
        }
        if (mes == 3) {
            if (dia >= 20) {
                //acuario
                return "aries";
            } else {
                //capricornio
                return "piscis";
            }
        }
        if (mes == 4) {
            if (dia >= 20) {
                return "tauro";
            } else {
                return "Aries";
            }
        }
        if (mes == 5) {
            if (dia >= 21) {
                //acuario
                return "geminis";
            } else {
                //capricornio
                return "tauro";
            }
        }
        if (mes == 6) {
            if (dia >= 20) {
                return "cancer";
            } else {
                return "geminis";
            }
        }
        if (mes == 7) {
            if (dia >= 22) {
                //acuario
                return "leo";
            } else {
                //capricornio
                return "cancer";
            }
        }
        if (mes == 8) {
            if (dia >= 21) {
                return "virgo";
            } else {
                return "leo";
            }
        }
        if (mes == 9) {
            if (dia >= 22) {
                //acuario
                return "libra";
            } else {
                //capricornio
                return "virgo";
            }
        }
        if (mes == 10) {
            if (dia >= 22) {
                return "escorpion";
            } else {
                return "libra";
            }
        }
        if (mes == 11) {
            if (dia >= 21) {
                //acuario
                return "sagitario";
            } else {
                //capricornio
                return "escorpion";
            }
        }
        if (mes == 12) {
            if (dia >= 21) {
                return "capricornio";
            } else {
                return "sagitario";
            }
        }
        return "fecha no valida";
    }
}
