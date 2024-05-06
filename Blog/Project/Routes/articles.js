const express = require('express');
const router = express.Router();
const articleContaines = require('../articleContains')

router.get('/', (req, res)=>{
    res.render('articles.ejs', {articles: articleContaines})
})

module.exports = router;