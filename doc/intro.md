# Forge Compiler

## Contents
1. [Requirements](https://github.com/andyrusu/forge-compiler/blob/master/doc/intro.md#req)
2. [Installation](https://github.com/andyrusu/forge-compiler/blob/master/doc/intro.md#install)
3. [Command line options](https://github.com/andyrusu/forge-compiler/blob/master/doc/intro.md#cmd)
4. [Generate AST to Clojure](https://github.com/andyrusu/forge-compiler/blob/master/doc/intro.md#generate-ast)
5. [Generate Clojure to AST](https://github.com/andyrusu/forge-compiler/blob/master/doc/intro.md#generate-clj)

<h2 id="req">1. Requirements</h2>
* Java version > 8

<h2 id="install">2. Installation</h2>
If you have Java installed you don't need to "install" the compiler, just download the .jar file.

<h2 id="cmd">3. Command line options</h2>
TODO
* ``` --type ``` select the convertion type (to ast or to clj)
* ``` --from ``` source path
* ``` --to ``` result path

<h2 id="generate-ast">Generate AST to Clojure</h2>
Run:
```
compile --type ast --from path/to/src --to path/to/compiled/src
```

<h2 id="generate-ast">Generate Clojure to AST</h2>
Run:
```
compile --type clj --from path/to/src --to path/to/compiled/src
```