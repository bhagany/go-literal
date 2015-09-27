(require 'cljs.build.api)

(cljs.build.api/build "src"
  {:main 'hello-world.core
   :output-dir "out"
   :output-to "out/go-literal.js"
   :target :nodejs})
