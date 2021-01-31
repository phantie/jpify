# jpify

Examples:

    (get-ip) ; "X.X.X.X"
    (get-ip :json) ; "{"ip":"X.X.X.X"}"
    (get-ip :jsonp) ; "callback({"ip":"X.X.X.X"});"
    (get-ip :jsonp :cb) ; "cb({"ip":"X.X.X.X"});"