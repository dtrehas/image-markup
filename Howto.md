#Howto

### Sample 1: Apply 2 markups to a given image ###

```
Image image = ...
ImageMarkup markup = new ImageMarkup();
markup.applyMarkup(image, 204, 4, 254, 55, null); // a simple markup
markup.applyMarkup(image, 274, 10, 424, 49, "I'm a text markup"); // a text markup
```

### Sample 2: Specify transparency support for transparent texbox backgrounds ###

```
ImageMarkup markup = new ImageMarkup();
MarkupRenderer renderer = markup.getRenderer();
DefaultMarkupRenderer dr = (DefaultMarkupRenderer) renderer;
dr.setUseTransparency(true);
```

### Sample 3: Set your very own markup renderer ###

```
MarkupRenderer renderer = ...
ImageMarkup markup = new ImageMarkup(renderer);
```

or

```
MarkupRenderer renderer = ...
ImageMarkup markup = new ImageMarkup();
markup.setRenderer(renderer);
```

