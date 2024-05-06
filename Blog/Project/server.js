const express = require('express');
const path = require('path');
const articleRouter = require('./Routes/articles');
const articleContaines = require('./articleContains')

const app = express();
const port = 3000;
app.set('view engine', 'ejs')
app.use(express.static('../Project'));
app.use('/article', articleRouter);


app.get('/', (req, res) =>{
    res.render('index.ejs', {articles: articleContaines})
})

app.listen(port, ()=>{
    console.log('Server is listening on port '+ port);
});