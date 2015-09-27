(require 'cljs.build.api)

(cljs.build.api/build "src"
  {:main 'go-literal.core
   :output-dir "out"
   :output-to "out/go-literal.js"
   :target :nodejs})
