(ns pyramid.core
  (:gen-class))

(defn exp [x n]
 	(if (zero? n) 1
     	(* x (exp x (dec n)))))

(defn draw-by-depth
	[current max_depth]
	(if-not (>= current max_depth)
		( do
			(print (apply str (repeat (- max_depth current) "   ")))
			(println (str (apply str (repeat (inc current) "  |   "))))
			(draw-by-depth (inc current) max_depth)
		)
	))

(defn -main
  	[& args]
  	(println "Size of the pyramid:")
  	(draw-by-depth 0 (read-string (read-line)) ))
