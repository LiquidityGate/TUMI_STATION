$(function () {
    var sections = $('.sections'),
        sectionButtons = $('.section-button'),
        sectionPanels = sections.children('.rightpanel-content');
        activeSectionPanel = sectionPanels.eq(sectionButtons.filter('.active-section').index());

    activeSectionPanel.addClass('active-section-panel');

    sectionButtons.on('click', function (e) {
        var button = $(this);
        button.siblings('.active-section').removeClass('active-section');
        button.addClass('active-section');

        sectionPanels.height('');

        if (button.hasClass('section-1')) {
            sections.css('transform', 'translate3d(0, 0, 0)');
        } else if (button.hasClass('section-2')) {
            sections.css('transform', 'translate3d(-100%, 0, 0)');
        } else if (button.hasClass('section-3')) {
            sections.css('transform', 'translate3d(-200%, 0, 0)');
        }
        e.preventDefault();
    });

    sections.on('transitionend webkitTransitionEnd oTransitionEnd', function(e) {
        var activePanel = sectionPanels.eq(sectionButtons.filter('.active-section').index());

        activePanel.css('height', '').siblings().css('height', '0px');
    });
});