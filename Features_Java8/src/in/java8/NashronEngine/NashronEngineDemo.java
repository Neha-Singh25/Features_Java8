
package in.java8.NashronEngine;

import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashronEngineDemo  {
	public static void main(String args[]) throws Exception {
		ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn");
		se.eval(new FileReader("demo.js"));
	}
}
