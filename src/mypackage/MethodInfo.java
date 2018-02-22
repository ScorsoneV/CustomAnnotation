package mypackage;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
/* Questa annotazione indica che gli elementi che utilizzeranno l'annotazione su cui è 
 * applicata la dovranno contenere nel proprio JavaDoc
 */
@Target(ElementType.METHOD)
/* Questa specifica dove possiamo applicare l'annotazione, se non speficiata l'annotazione
 * può essere applicata ad ogni elemento.
 * I possibili valori sono: METHOD, PACKAGE, PARAMETER, TYPE, ANNOTATION_TYPE, CONSTRUCTOR,
 * LOCAL_VARIABLE, FIELD
 */
@Inherited
/* Questa annotazione specifica che l'annotazione sarà ereditata da tutte le sottoclassi
 * delle classi a cui viene applicata
 * */
@Retention(RetentionPolicy.RUNTIME)
/* Questa indica quanto a lungo l'annotazione deve essere mantenuta. Ne esistono 3 tipi:
 * - RUNTIME: l'annotazione sarà disponibile anche a runtime
 * - CLASS: l'annotazione sarà disponibile nel file .class ma non a runtime
 * - SOURCE: l'annotazione sarà disponibile solo nel codice sorgente
 * */
public @interface MethodInfo{
	String author();
	String date();
	int revision() default 1;
	String comments();
}
