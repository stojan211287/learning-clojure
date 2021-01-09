(ns reverse-string)

(defn myfunc [acc char]
  (conj acc char))

(defn reverse-string [s] 
  (clojure.string/join "" 
    (reduce myfunc '() (seq s))))