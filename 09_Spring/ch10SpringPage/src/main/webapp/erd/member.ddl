/**********************************/
/* Table Name: tmember */
/**********************************/
CREATE TABLE tmember(
		id                            		VARCHAR2(10)		 NOT NULL,
		passwd                        		VARCHAR2(10)		 NOT NULL,
		name                          		VARCHAR2(60)		 NOT NULL,
		email                         		VARCHAR2(150)		 NOT NULL,
		reg_date                      		DATE		 NOT NULL
);

COMMENT ON TABLE tmember is 'tmember';
COMMENT ON COLUMN tmember.id is 'id';
COMMENT ON COLUMN tmember.passwd is 'passwd';
COMMENT ON COLUMN tmember.name is 'name';
COMMENT ON COLUMN tmember.email is 'email';
COMMENT ON COLUMN tmember.reg_date is 'reg_date';


/**********************************/
/* Table Name: tboard */
/**********************************/
CREATE TABLE tboard(
		seq                           		NUMBER		 NOT NULL,
		title                         		VARCHAR2(150)		 NOT NULL,
		content                       		CLOB		 NOT NULL,
		id                            		VARCHAR2(10)		 NULL 
);

COMMENT ON TABLE tboard is 'tboard';
COMMENT ON COLUMN tboard.seq is 'seq';
COMMENT ON COLUMN tboard.title is 'title';
COMMENT ON COLUMN tboard.content is 'content';
COMMENT ON COLUMN tboard.id is 'id';



ALTER TABLE tmember ADD CONSTRAINT IDX_tmember_PK PRIMARY KEY (id);

ALTER TABLE tboard ADD CONSTRAINT IDX_tboard_PK PRIMARY KEY (seq);
ALTER TABLE tboard ADD CONSTRAINT IDX_tboard_FK0 FOREIGN KEY (id) REFERENCES tmember (id);

