Running this:

```
java -cp cljs.jar:core.async-0.1.346.0-17112a-alpha.jar:src clojure.main build.clj
```

Results in:

```
WARNING: Use of undeclared Var go-literal.core/text at line 7 src/go_literal/core.cljs
```

In `src/go_literal/core.cljs`, removing the `go` block and raising the `let` to the top level results in no warnings
