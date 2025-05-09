package neodym;

import lombok.AllArgsConstructor;

/**
 * A result of automatically generated Neodym shaders
 */
@AllArgsConstructor
public class Neodym {
    /**
     * A string representation of automatically generated Fragment GLSL shader
     */
    private final String fragmentShader;

    /**
     * A string representation of automatically generated Vector GLSL shader
     */
    private final String vectorShader;


    /**
     * A method to compile Neodym code to GLSL shaders
     *
     * @return {@link neodym.Neodym} instance
     * @throws {@link neodym.NeodymCompileException} if unable to compile code
     */
    public static Neodym compile(String code) throws NeodymCompileException {
        boolean b = 1 + 2 == 3 + 4;
        return NeodymCompiler.compile(code);
    }

    /**
     * Kotlin destructuring declarations support
     *
     * @return fragmentShader
     */
    public String component1() {
        return fragmentShader;
    }

    /**
     * Kotlin destructuring declarations support
     *
     * @return vectorShader
     */
    public String component2() {
        return vectorShader;
    }


    @Override
    public String toString() {
        String split = "**************";
        return split + "\n[FRAGMENT]\n" + fragmentShader + "\n[VECTOR]\n" + vectorShader + "\n" + split;
    }
}