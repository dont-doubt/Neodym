# <ins>Neodym</ins> - Unique Modern shader language compiling to GLSL shader

---

<br>

## What is <ins>Neodym</ins>?
<ins>**Neodym**</ins> is a new programming language. It can be compiled into GLSL shaders.

<br>

> [!IMPORTANT]
> <ins>**Neodym**</ins> shader language uses `.neo` file extension.<br>

> [!NOTE]
> For now, <ins>**Neodym**</ins> shader language compiler is written only in **Java**<br>
> You can use this code in **Java**:
> ```java
> String code = /* ... Code in Neodym shader language */
> 
> NeodymResult result = Neodym.compile(code);
> String fragment = result.getFragmentShader();
> String vector = result.getVectorShader();
> ```
> And this code in **Kotlin**:
> ```kotlin
> val code: String = /* ... Code in Neodym shader language */
> 
> val (fragment, vector) = Neodym.compile(code)
> ```
> to compile get both `fragment` and `vector` **GLSL** shader representations as String

<br>

# Why <ins>Neodym</ins>?
<ins>**Neodym**</ins> is just much more flexible and readable language rather than **GLSL**.<br>

### GLSL do have some annoying syntax flaws. So, we decided to fix them:
We have replaced<br>

|   1   |   2   |   3   |   4   |
|:-----:|:-----:|:-----:|:-----:|
| float | vec2  | vec3  | vec4  |
|  int  | ivec2 | ivec3 | ivec4 |
| bool  | bvec2 | bvec3 | bvec4 |

by these types:

|   1   |   2    |   3    |   4    |
|:-----:|:------:|:------:|:------:|
| float | float2 | float3 | float4 |
|  int  |  int2  |  int3  |  int4  |
| bool  | bool2  | bool3  | bool4  |

Also, you can omit `;` at the end of code statements.<br>

You have no longer define version for each shader. It will automatically
be compiled to `#version 330`, so 

> [!WARNING]
> _This chapter is not finished yet..._

<br>

---
## Examples
The shader might be optionally used with single `vector` statement to declare vector 
shader behaviour:
```
vector {
    /* Vector shader */
}

/* Fragment shader */
```
If there's no `vector` statement, then default vector shader is being
used:
```
main {
    gl_TexCoord[0] = gl_MultiTexCoord0
    gl_Position = gl_ModelViewProjectionMatrix * gl_Vertex
}
```

> [!WARNING]
> _This chapter is not finished yet..._
 
<br>

# Have a <ins>question</ins>? Got an <ins>issue</ins>?
You can leave an **issue** or a **question** by following link:
[**&lt;Click Here&gt;**](https://github.com/manifold-systems/manifold/issues)

# <ins>Author</ins>

> ### rivta (GitHub: [@dont-doubt](https://github.com/dont-doubt))
> <i></i>

<br>

## Contibuting <ins>Neodym</ins> language:
Thanks for everyone who will help us to contribute our project.

> [!NOTE]
> <ins>**Neodym**</ins> uses [**Lombok**](https://projectlombok.org/) annotation processor in code


## Special thanks to:
#### [ANTLR4 contibutors](https://github.com/antlr/antlr4)
#### [Lombok contibutors](https://projectlombok.org/)


<!--
[!NOTE]
[!IMPORTANT]
[!WARNING]
-->