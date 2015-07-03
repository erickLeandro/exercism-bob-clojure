(ns bob)

(defn check-uppercase [phrase] 
	(if count (< 1
			(empty? 
				(filter #(Character/isUpperCase %) 
					(char-array phrase)))) 
		false
		true
))

(defn check-empty [phrase]
	(empty? (clojure.string/trim phrase))
)

(defn check-is-question [phrase]
	(if (= \? (last phrase)) true false)
)

(defn response-for [phrase] 
	(cond 
		(check-empty phrase) "Fine. Be that way!"
		(check-is-question phrase) "Sure."
		(check-uppercase phrase) "Whoa, chill out!"
		:else "Whatever."
))
