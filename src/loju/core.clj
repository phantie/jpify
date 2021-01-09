(ns loju.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(/ 1 0)

(some #{"b"} ["a" "b"])

(defn in-vector [value vector] (some? (some #{value} vector)))

(in-vector "c" ["a" "b"])

(/ 1 0)

(pst)

clojure.set/union

(doc some)
(doc some?)

(into (sorted-map) {"b" 2 "a" 1 "c" 3})

(use '[clojure repl string])

(source +)

(doc trim)
(map trim (split "a, b, c" #","))

(defn- private [x y] (+ x y))
(defn pub [x y] (private x y))

(private 1 2)

(find-doc "iterator")

(rsubseq (into (sorted-set) [234 324 324 534654 56 7567 8 6785 876 8]) > 1000 < 500000)

(type '(1 2 3))
(type (seq '(1 2 3)))

(defn destruct [[a b]] (+ a b))

(destruct {:a 1 :b 2})

(doc comp)

(#{1 2})

(filter #(= % [:a 1]) {:a 1 :b 2})
(filter (comp #{2 3 5} last) {:a 1 :b 2})

(->> (repeatedly #(rand)) (take 5 ,,,) (filter #(> % 0.5) ,,,))

(take 3 (repeatedly #(rand)))

(doc some-fn)


(filter
  (some-fn even? #(> % 5))
  (range 10))

(remove #(< 5 %) (range 20))

(mod 1 3)

(frequencies [1 2 1 2 3 4 5])

(take 10 (take-nth 10 (range 100)))

(doc identity)

((juxt (partial * 2) zero?) 1)


(apply str (concat "abc" "def"))

(->> (concat "abc" "def") (apply str ,,,))

(defn str-concat
  "DOC STRINGGGGG"
  {:super :b}
  ([] "")
  ([arg] arg)
  ([arg & args] (->> (apply concat arg args) (apply str ,,,)))
)

(:name (meta #'str-concat))

(defn hinted ^long [] 42)

(-> #'hinted meta :arglists first)

(doc str-concat)

(str-concat)
(str-concat "a")
(str-concat "a" "b" "c" "defg")

(doc do)

(conj [] 1 2 3 4)


(defn hinted ^long [x] (+ 42 x))

(defn bar [x] (fn [y] (+ x y)))

((bar 2) 2)

(def a (future (/ 1 0)))

(doc condp)

(apply interleave {:a 1, :b 2, :c 3})

(into {} (map (partial into []) (partition 2 (interleave (repeat "a") [1 2 3]))))

