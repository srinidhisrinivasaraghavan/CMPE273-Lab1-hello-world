package hello

//import org.springframework.context.annotation.Configuration
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration
//import org.springframework.context.annotation.ComponentScan
import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._
import scala.collection.JavaConversions._

/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author srinidhis
 * @since 1.0
 */
@Controller
//@Configuration
@EnableAutoConfiguration
//@ComponentScan
class HelloConfig {
	@RequestMapping(Array("/"))
	@ResponseBody
	def home(): String = "Hello World!"

}
