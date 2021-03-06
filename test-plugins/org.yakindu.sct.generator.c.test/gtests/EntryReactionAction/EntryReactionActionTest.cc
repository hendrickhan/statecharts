/** Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "EntryReactionAction.h"

#include "sc_timer_service.h"

static EntryReactionAction statechart;


class EntryReactionActionTest : public ::testing::Test
{
public:
	/* All operations from the SCTUnit test class. */
	void entryTransitionActionOnStatechartEnter();
	void entryOnRTS();
	void noEntryTransitionActionOnHistory();
	void init();
	void setTimer(EntryReactionAction* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic);
	void unsetTimer(EntryReactionAction* handle, const sc_eventid evid);
protected:
	sc_unit_timer_service_t timer_service;
	virtual void SetUp();
};

static EntryReactionActionTest * tc;


void EntryReactionActionTest::SetUp()
{
	entryReactionAction_init(&statechart);
	sc_timer_service_init(
		&timer_service,
		0,
		(sc_run_cycle_fp) &entryReactionAction_runCycle,
		false,
		200,
		&statechart
	);
	
	
	tc = this;
}
void EntryReactionActionTest::entryTransitionActionOnStatechartEnter()
{
	entryReactionAction_enter(&statechart);
	EXPECT_TRUE(entryReactionActionIface_get_enteredR1(&statechart));
	EXPECT_TRUE(entryReactionActionIface_get_enteredR2(&statechart));
	EXPECT_TRUE(entryReactionActionIface_get_enteredBdefault(&statechart));
	EXPECT_TRUE(!entryReactionActionIface_get_enteredBother(&statechart));
}
void EntryReactionActionTest::entryOnRTS()
{
	tc->init();
	entryReactionActionIface_raise_b(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(!entryReactionActionIface_get_enteredR1(&statechart));
	EXPECT_TRUE(!entryReactionActionIface_get_enteredR2(&statechart));
	EXPECT_TRUE(!entryReactionActionIface_get_enteredBdefault(&statechart));
	EXPECT_TRUE(entryReactionActionIface_get_enteredBother(&statechart));
}
void EntryReactionActionTest::noEntryTransitionActionOnHistory()
{
	tc->init();
	entryReactionActionIface_raise_d(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(!entryReactionActionIface_get_enteredR1(&statechart));
	EXPECT_TRUE(!entryReactionActionIface_get_enteredR2(&statechart));
	EXPECT_TRUE(!entryReactionActionIface_get_enteredBdefault(&statechart));
	EXPECT_TRUE(!entryReactionActionIface_get_enteredBother(&statechart));
}
void EntryReactionActionTest::init()
{
	entryReactionAction_enter(&statechart);
	entryReactionActionIface_raise_b(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	entryReactionActionIface_raise_d(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	entryReactionActionIface_set_enteredR1(&statechart,false);
	entryReactionActionIface_set_enteredR2(&statechart,false);
	entryReactionActionIface_set_enteredBdefault(&statechart,false);
	entryReactionActionIface_set_enteredBother(&statechart,false);
}

void EntryReactionActionTest::setTimer(EntryReactionAction* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic){
	sc_timer_t timer;
	sc_timer_init(&timer, time_ms, periodic, evid);
	insert_timer(&(tc->timer_service), timer);
}

void EntryReactionActionTest::unsetTimer(EntryReactionAction* handle, const sc_eventid evid){
	delete_task(&(tc->timer_service), find_time_event(&timer_service, evid));
}

TEST_F(EntryReactionActionTest, entryTransitionActionOnStatechartEnter) {
	entryTransitionActionOnStatechartEnter();
}
TEST_F(EntryReactionActionTest, entryOnRTS) {
	entryOnRTS();
}
TEST_F(EntryReactionActionTest, noEntryTransitionActionOnHistory) {
	noEntryTransitionActionOnHistory();
}


